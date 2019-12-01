
public class RectangleArray {
	
	public static void main(String[] args) {
		int [][] arr = { { 1, 0, 0, 1, 0 },  
                		 { 0, 0, 1, 0, 1 },  
                		 { 0, 0, 0, 1, 0 },  
                		 { 1, 0, 1, 0, 1 } };
		int rows = arr.length;
		int cols = arr[0].length;
		for(int i =0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(arr[i][j]==1) {
					//System.out.println(i+" "+j);
					for(int k=i+1;k<rows;k++) {
						for(int l=j+1;l<cols;l++) {
							//System.out.println(k+" "+l);
							if(arr[i][l]==1 && arr[j][l]==1 && arr[k][l]==1) {
								System.out.println("Found");
								System.exit(0);
							}
						}
					}
					
				}
			}
		}
	}	

}
