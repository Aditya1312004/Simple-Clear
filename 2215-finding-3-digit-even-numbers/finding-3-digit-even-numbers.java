class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> al = new HashSet<>();

        int n = digits.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i==j ||j==k || k==i) continue;
                     int d1 = digits[i];
                     int d2 = digits[j];
                     int d3 = digits[k];

                     if(d1 == 0) continue;
                     if(d3%2 != 0) continue;

                     int num = digits[i] *100 + digits[j] * 10 + digits[k];
                     al.add(num);
                }
            }
        }
        List<Integer> po = new ArrayList<>(al);
        Collections.sort(po);
        int [] ui = new int [po.size()];
        for(int u=0;u<po.size();u++){
            ui[u] = po.get(u);
        }
        
        return ui;
            
            
            }
}