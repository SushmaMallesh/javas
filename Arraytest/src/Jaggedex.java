
public class Jaggedex {
public static void main(String args[]) {
	int[][] jaggedArray= {{1},{1,2},{4,5,6},{7,8,9,20}};

	int count=1;
	for(int i=0;i<jaggedArray.length;i++) {
		for(int j=0;j<jaggedArray[i].length;j++) {
			jaggedArray[i][j]=count;
			count=count+1;
			
		}
	}
	for(int i=0;i<jaggedArray.length;i++) {
		for(int j=0;j<jaggedArray[i].length;j++) {
			System.out.print(jaggedArray[i][j]+" ");
			
			
		}
		System.out.println();
		
	}
}
}
