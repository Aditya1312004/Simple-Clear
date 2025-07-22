class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        String pre ="";
    List<String> as = new ArrayList<>();
        for(String f: folder){  
            if(!f.startsWith(pre) || f.charAt(pre.length())!='/'|| pre.isEmpty()){
                as.add(f);
                pre = f;
            }
        }
        return as;
    }
}