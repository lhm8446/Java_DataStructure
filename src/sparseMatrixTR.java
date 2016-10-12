public class sparseMatrixTR {

	public static void main(String[] args) {
		
		int[][] a = {{7,4,4},{0,3,9},{1,1,1},{3,2,7},{5,0,3}};
		
		int m =a[0][0];
		int n =a[0][1];
		int v =a[0][2];
		
		// a배열 출력
		System.out.println("논리적 희소행렬");
		for(int i = 0; i <a.length; i++){
			for(int j = 0; j <a[i].length; j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("");
		
		// 전치행렬 배열 생성
		int[][] b = new int[a.length][a[0].length];	
		
		// 전치행렬  b 행,열 지정
		b[0][0] = n;
		b[0][1] = m;
		b[0][2] = v;

		if(v != 0){									// v가 0이 아닐때만 연산
			int p=1;		
			for(int i= 0; i<n;i++){					// a의 열 수까지 실행
				for(int j=1; j<=v; j++){			// 희소행렬의 값이 있는 수만큼 실행
					if(a[j][1]==i){					// a의 열이 b의 행이되니까 b의 1행부터 차례대로 입력,
						b[p][0] = a[j][1];
						b[p][1] = a[j][0];
						b[p][2] = a[j][2];
						p++;
					}
				}
			}
		}
		
		// 전치된 b배열 출력(논리적 배열)
		System.out.println("전치된 논리적 희소행렬");
		for(int i = 0; i <b.length; i++){
			for(int j = 0; j <b[i].length; j++){
				System.out.print(b[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("");
		
		
		// 전치행렬된 b배열을 희소행렬로 출력
		int[][] s=new int[n][m];
		for(int i = 1; i <b.length; i++){
			s[b[i][0]][b[i][1]] = b[i][2];
		}
		
		// s 배열 출력
		System.out.println("전치된 희소행렬");
		for(int i = 0; i <s.length; i++){
			for(int j = 0; j <s[i].length; j++){
				System.out.print(s[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
