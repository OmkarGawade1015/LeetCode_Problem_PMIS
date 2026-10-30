class Solution {
    public int numUniqueEmails(String[] emails) {

        Set<String> uniq=new HashSet<>();	
		for(String email:emails) {	
			String[] parts=email.split("@");
			
			String[] local=parts[0].split("\\+");
			
			String cleanedEmail = local[0].replace(".", "") + "@" + parts[1];
            uniq.add(cleanedEmail);
        }
		return uniq.size();
        
    }
}