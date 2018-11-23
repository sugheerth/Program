import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author gramkumar
 */
 @SuppressWarnings("unchecked")
 class CustomQueryParser {
	private String query;
	private String filePattern;
	private int fileGroup;

	private String authorPattern;
	private int authorGroup;

	private String langPattern;
	private int langGroup;

	private String projectPattern;
	private int projectGroup;

	private String groupPattern;
	private int sGroup;

        private String branchPattern;
        private int branchGroup;

        private String defPattern;
        private int defGroup;

	private String contentPattern;
	private String[] contents;
	private String[] fileNames;
	private String[] langNames;
	private String[] projectNames;
	private String[] branchNames;
	private String[] groupNames;
	private String[] authorNames;
	private String[] defList;

	/** Creates a new instance of CustomQueryParser */
	public CustomQueryParser() {
		this.query = "";
		this.filePattern = "";
		this.contentPattern = "";
		this.groupPattern = "";
		this.projectPattern = "";
		this.langPattern = "";
		this.authorPattern = "";
		this.defPattern = "";
		this.branchPattern = "";
		this.fileGroup = 1;
		this.sGroup = 1;
		this.projectGroup = 1;
		this.langGroup = 1;
		this.authorGroup = 1;
		this.defGroup = 1;
		this.branchGroup = 1;
	}

	public CustomQueryParser(String query, String filePattern, int filegroup) {
		this.query = query;
		this.filePattern = filePattern;
		this.fileGroup = filegroup;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getQuery() {
		return this.query;
	}

	public void setFilePattern(String filePattern) {
		this.filePattern = filePattern;
	}

	public String getFilePattern() {
		return this.filePattern;
	}

	public void setFileGroup(int fileGroup) {
		this.fileGroup = fileGroup;
	}

	public int getFileGroup() {
		return this.fileGroup;
	}

	public void setLanguagePattern(String langPattern) {
		this.langPattern = langPattern;
	}

	public String getLanguagePattern() {
		return this.langPattern;
	}

	public void setLanguageGroup(int langGroup) {
		this.langGroup = langGroup;
	}

	public int getLanguageGroup() {
		return this.langGroup;
	}

	public void setProjectPattern(String projectPattern) {
		this.projectPattern = projectPattern;
	}

	public String getProjectPattern() {
		return this.projectPattern;
	}

	public void setProjectGroup(int projectGroup) {
		this.projectGroup = projectGroup;
	}

	public int getProjectGroup() {
		return this.projectGroup;
	}

        public void setBranchPattern(String branchPattern) {
            this.branchPattern = branchPattern;
        }

        public String getBranchPattern() {
            return this.branchPattern;
        }

        public void setBranchGroup(int branchGroup) {
            this.branchGroup = branchGroup;
        }

        public int getBranchGroup() {
            return this.branchGroup;
        }

	public void setGroupPattern(String groupPattern){
		this.groupPattern = groupPattern;
	}

	public String getGroupPattern(){
		return this.groupPattern;
	}

	public void setSearchGroup(int sGroup){
		this.sGroup = sGroup;
	}

	public int getSGroup(){
		return this.sGroup;
	}

	public void setAuthorPattern(String authorPattern){
                this.authorPattern = authorPattern;
        }

        public String getAuthorPattern(){
                return this.authorPattern;
        }

        public void setAuthorGroup(int authorGroup){
                this.authorGroup = authorGroup;
        }

        public int getAuthorGroup(){
                return this.authorGroup;
        }


	public void setDefPattern(String defPattern){
                this.defPattern = defPattern;
        }

        public String getDefPattern(){
                return this.defPattern;
        }

        public void setDefGroup(int defGroup){
                this.defGroup = defGroup;
        }

        public int getDefGroup(){
                return this.defGroup;
        }

	public String[] getFileName() {
		return this.fileNames;
	}

	public String[] getContents() {
		return this.contents;
	}

	public String[] getLanguageName() {
		return this.langNames;
	}

	public String[] getProjectName() {
		return this.projectNames;
	}

	public String[] getAuthorName(){
		return this.authorNames;
	}

	public String[] getGroupName(){
		return this.groupNames;
	}

	public String[] getDefList(){
		return this.defList;
	}

        public String[] getBranchName(){
            return this.branchNames;
        }


	private String[] getFieldValues(String inputString, String matchPattern,
			int captureGroup) {
		Vector<String> fieldVector = new Vector<String>();
		String fieldValues[] = new String[0];
		try {
			Pattern fieldPattern = Pattern.compile(matchPattern);
			Matcher fieldMatcher = fieldPattern.matcher(inputString);
			while (fieldMatcher.find()) {
				fieldVector.add(fieldMatcher.group(captureGroup));
			}
		} catch (Exception e) {
			e.printStackTrace();
			return fieldValues;
		}

		fieldValues = fieldVector.toArray(new String[0]);

		return fieldValues;
	}

	private String[] getContentFromQuery() {
		String[] newcontents = new String[0];
		StringTokenizer strtok = new StringTokenizer(this.query, " ");
		// String excludePattern =
		// "filename:[^\\s]+|lang:[^\\s]+|project:[^\\s]+";
		String[] excludePatterns = {"filename:[^\\s]+", "group:[^\\s]+", "project:[^\\s]+", "lang:[^\\s]+", "language:[^\\s]+", "author:[^\\s]+", "definition:[^\\s]+", "branch:[^\\s]+"};
		Vector<String> contentVector = new Vector<String>();

//		for(int i = 0; i < excludePatterns.length; i++){
			while (strtok.hasMoreTokens()) {
				String token = strtok.nextToken();
				if (token.matches(excludePatterns[0]) || token.matches(excludePatterns[1]) || token.matches(excludePatterns[2]) || token.matches(excludePatterns[3]) || token.matches(excludePatterns[4]) || token.matches(excludePatterns[5]) || token.matches(excludePatterns[6]) || token.matches(excludePatterns[7]) ) {
					if(!token.matches(excludePatterns[0]) && !token.matches(excludePatterns[7])){
						this.query = this.query.replace(token, "").trim();
					}
				} else {
					contentVector.add(token);
					contentVector.add(" ");
				}
			}
//		}
		newcontents = contentVector.toArray(new String[0]);

		return newcontents;
	}

	public void parse() {
		this.fileNames = getFieldValues(this.query, this.filePattern,
				this.fileGroup);
		this.langNames = getFieldValues(this.query, this.langPattern,
			 this.langGroup);
		if(this.langNames.length == 0){
			this.langNames = getFieldValues(this.query, "\\blanguage:([^\\s]+)", this.langGroup);
		}
		this.authorNames = getFieldValues(this.query, this.authorPattern,
                         this.authorGroup);
		this.groupNames = getFieldValues(this.query.toUpperCase(), this.groupPattern,
                         this.sGroup);
		this.projectNames = getFieldValues(this.query.toUpperCase(), this.projectPattern,
			 this.projectGroup);
                this.defList = getFieldValues(this.query, this.defPattern, this.defGroup);
                this.branchNames = getFieldValues(this.query, this.branchPattern,
                        this.branchGroup);
		//this.contents = this.query.split(this.filePattern);
		this.contents = getContentFromQuery();
	}

	public String escape(String inputString) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < inputString.length(); i++) {
			char c = inputString.charAt(i);
			if (c == '\\' || c == '+' || c == '-' || c == '!' || c == '('
					|| c == ')' || c == ':' || c == '^' || c == '[' || c == ']'
					|| c == '\"' || c == '{' || c == '}' || c == '~' || c == '@' || c == '&' || c == '$' || c == '/') {
				sb.append('\\');
			}
			sb.append(c);
		}

		return sb.toString();
	}

	public static String getContentsString(String[] fields) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < fields.length; i++) {
			sb.append(fields[i]);
		}

		return sb.toString();
	}

	public static String getQueryRemovingSingleWildCard(String field) {
		StringTokenizer strtok = new StringTokenizer(field);
		StringBuffer sb = new StringBuffer();
		while (strtok.hasMoreTokens()) {
			String token = strtok.nextToken();
			if ((token.length() == 1)
					&& (token.charAt(0) == '*' || token.charAt(0) == '?')) {
				continue;
			}
			sb.append(token + " ");
		}

		return sb.toString();
	}

	public boolean checkLeadingWildCards(String field) {
		boolean fieldParsable = true;

		StringTokenizer strtok = new StringTokenizer(field);

		while (strtok.hasMoreTokens()) {
			String token = strtok.nextToken().trim();

			for (int i = 0; i < token.length(); i++) {
				char c = token.charAt(i);
				if (i == 0) {
					if (c == '*' || c == '?') {
						fieldParsable = false;
						return fieldParsable;
					}
				} else {
					fieldParsable = true;
					break;
				}
			}
		}

		return fieldParsable;

	}

	public boolean checkUniqueFileNames(String[] files) {
		Hashtable filesTable = new Hashtable();
		try {
			for (int i = 0; i < files.length; i++) {
				int prevcount = 0;
				String filename = files[i].trim();
				if (filesTable.get(filename) != null) {
					int fileCount = ((Integer) filesTable.get(filename))
							.intValue();
					prevcount = fileCount;
				}
				filesTable.put(filename, ++prevcount);
			}
			if (filesTable.size() > 1) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public static String parse(String query, String operator) {
		String returnString = "";
		StringTokenizer strTok = new StringTokenizer(query);
		StringBuffer sb = new StringBuffer();
		boolean done = true;
		String appendOperator = "";
		if (operator.equals("OR")) {
			appendOperator = "OR";
		} else {
			appendOperator = "AND";
		}

		while (strTok.hasMoreTokens()) {
			String token = strTok.nextToken();
			if (token.equals("AND") || token.equals("OR")) {
				continue;
			}

			if (token.startsWith("\\-")) {
				token = token.substring(2);
				if (!token.equals("")) {
					sb.append("NOT " + token + " ");
				}
				done = false;
			} else {
				if (done) {
					sb.append(token + " ");
					done = false;
				} else {
					sb.append(appendOperator + " " + token + " ");
					done = false;
				}
			}
		}
		returnString = sb.toString().trim();
		return returnString;
	}

	public static void main(String[] args) {
		String inputstring = "*string* bufferfilename:asdf filename:store.java tree project:new hello filename:store.java filename:abc.java";
		String matchpattern = "\\bfilename:([^\\s]+)\\b";
		CustomQueryParser parser = new CustomQueryParser();
		parser.setQuery(inputstring);
		System.out.println("\n Query : " + parser.getQuery());
		parser.setFilePattern(matchpattern);
		parser.setFileGroup(1);
		System.out.println("\n Query : " + parser.getQuery());
		parser.parse();
		System.out.println("\n Query : " + parser.getQuery());
		String files[] = parser.getFileName();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
		System.out.println("\n Query : " + parser.getQuery());
		String cont[] = parser.getContents();
		for (int i = 0; i < cont.length; i++) {
			System.out.println(cont[i]+ " " +parser.checkLeadingWildCards(cont[i].trim()));
			

		}
		if (!parser.checkUniqueFileNames(files)) {
			System.out.println("MORE FILES");
		}

	}
}

