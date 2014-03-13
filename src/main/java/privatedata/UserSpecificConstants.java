package privatedata;

public class UserSpecificConstants {
	// Constants
	public static final String googleApplicationName = "JWebPaidSearch";
	public static final String googleAPIKey = "AIzaSyCKTOWQ7_frEn3dvqdQRnbZ6fhvo7F-WG4"; //Google provided API key
	public static final String googleCustomSearchID = "008991626419004307712:atwudspyacm";
	
	public static final String indriIndex = "/home/jvujjini/Watson/wiki_indri_index";
    public static final String luceneIndex = "/home/jvujjini/Watson/wiki_lucene_index";
    public static final String quotesIndriIndex = "/home/jvujjini/Watson/quotes_indri_index";
    public static final String quotesLuceneIndex = "/home/jvujjini/Watson/quotes_lucene_index";
    public static final String luceneSearchField = "text";
    public static final String indriResultsFilter = "#filrej(list.title #combine(%s))"; 
    public static final String luceneResultsFilter = " NOT title:*\\:*" + " NOT title:list*";
}
