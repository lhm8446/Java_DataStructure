package linearlist;


public class transpose {

	public static void main(String[] args) {
		
		int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//		int[][] a = {{0,0,0,0,1},{1,0,0,0,0},{0,0,3,0,0},{0,0,0,2,0}};
		
		
		//전치행렬 생성
		int[][] b = new int[a[0].length][a.length];
		
		// 기존 배열출력
		for(int i = 0; i <a.length; i++){
			for(int j = 0; j <a[i].length; j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("");
		
		
		//전치연산
		for(int i = 0; i <a.length; i++){
			for(int j = 0; j <a[i].length; j++){
				b[j][i] = a[i][j];
			}
		}
		
		// 전치된 배열 출력
		System.out.println("");
		
		for(int i = 0; i <b.length; i++){
			for(int j = 0; j <b[i].length; j++){
				System.out.print(b[i][j]+"\t");
			}
			System.out.println("");
		}
		
	}
}
