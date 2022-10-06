import java.util.Scanner;


class Othello{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] board = {{2,2,2,2,2,2,2,2,2,2},
					   {2,0,0,0,0,0,0,0,0,2},
					   {2,0,0,0,0,0,0,0,0,2},
					   {2,0,0,0,0,0,0,0,0,2},
					   {2,0,0,0,1,-1,0,0,0,2},
					   {2,0,0,0,-1,1,0,0,0,2},
					   {2,0,0,0,0,0,0,0,0,2},
					   {2,0,0,0,0,0,0,0,0,2},
					   {2,0,0,0,0,0,0,0,0,2},
					   {2,2,2,2,2,2,2,2,2,2},
		};
		
		//石を置く座標
		int x,y;
		x = 0;
		y = 0;
		
		//石を置けるか否か
		boolean judge;
		judge = true;
		
		//返せる石の枚数
		int up,down,right,left,rightup,rightdown,leftup,leftdown;
		up = 0;
		down = 0;
		right = 0;
		left = 0;
		rightup = 0;
		rightdown = 0;
		leftup = 0;
		leftdown = 0;
		
		//先攻は黒
		int turn;
		turn = -1;
		
		int cnt;
		cnt = 1;
		
		//ゲーム終了時の石の枚数
		int cntBlack;
		int cntWhite;
		cntBlack = 0;
		cntWhite = 0;
		
		//パスするか否か
		boolean pass1,pass2;
		pass1 = true;
		pass2 = true;
		
	
		
		//盤面表示
		for (int i = 1; i <9 ; i++) {
			for (int j = 1; j < 9; j++) {
				if(board[i][j]==1) {
					System.out.print("●");
				}else if(board[i][j] == -1) {
					System.out.print("○");
				}else {
					System.out.print("□");
				}
				
			}
			System.out.println();
		}
		
		
		//両方がパスでない場合    
		while(pass1 || pass2) {
			pass1 = false;
			pass2 = false;
		    judge = true;
			
			//石を置きなおす
			while(judge) {
			judge=false;
			
			if(turn==1) {
				System.out.println("白の番です");
			}else {
				System.out.println("黒の番です");
			}
			
			//石を置く
			System.out.println("石を置いてください");
			System.out.print("x座標-->");
			x = sc.nextInt();
			System.out.print("y座標-->");
			y = sc.nextInt();
			
			
		//石を置けるか否か
			
		//入力した座標にすでに石が置いてある場合	
		if(board[y][x] != 0) {
			judge = true;
		}
		
		//右
		while(board[y][x+cnt] != 2) {
			if(board[y][x+cnt]==0) {
				right = 0;
				break;
			}
			if(board[y][x+cnt]==turn) {
				
				break;
			}
			if(board[y][x+cnt]==turn*-1) {
				right++;
				if(board[y][x+cnt+1]==2) {
					right=0;
				}
			
			}
			
			cnt++;
			
			}
		cnt  =1;
		
		
		//左
		while(board[y][x-cnt] != 2) {
			if(board[y][x-cnt]==0) {
				left = 0;
				break;
			}
			if(board[y][x-cnt]==turn) {
				
				break;
			}
			if(board[y][x-cnt]==turn*-1) {
				left++;
				if(board[y][x-cnt-1]==2) {
					left=0;
				}
			
			}
			
			
			cnt++;
			
			}
		cnt  =1;
	
		
		//上
		while(board[y-cnt][x] != 2) {
			if(board[y-cnt][x]==0) {
				up = 0;
				break;
			}
			if(board[y-cnt][x]==turn) {
				
				break;
			}
			if(board[y-cnt][x]==turn*-1) {
				up++;
				if(board[y-cnt-1][x]==2) {
					up=0;
				}
			
			}
			
			
			cnt++;
			
			}
		cnt  =1;
	
		
		//下
		while(board[y+cnt][x] != 2) {
			if(board[y+cnt][x]==0) {
				down = 0;
				break;
			}
			if(board[y+cnt][x]==turn) {
				
				break;
			}
			if(board[y+cnt][x]==turn*-1) {
				down++;
				if(board[y+cnt+1][x]==2) {
					down=0;
				}
			
			}
			
			
	
			cnt++;
			
			}
		cnt  =1;
		
		
		//右上
		while(board[y-cnt][x+cnt] != 2) {
			if(board[y-cnt][x+cnt]==0) {
				rightup = 0;
				break;
			}
			if(board[y-cnt][x+cnt]==turn) {
				
				break;
			}
			if(board[y-cnt][x+cnt]==turn*-1) {
				rightup++;
				if(board[y-cnt-1][x+cnt+1]==2) {
					rightup=0;
				}
			
			}
			

	
			cnt++;
			
			}
		cnt  =1;
		
		
		//右下
		while(board[y+cnt][x+cnt] != 2) {
			if(board[y+cnt][x+cnt]==0) {
				rightdown = 0;
				break;
			}
			if(board[y+cnt][x+cnt]==turn) {
				
				break;
			}
			if(board[y+cnt][x+cnt]==turn*-1) {
				rightdown++;
				if(board[y+cnt+1][x+cnt+1]==2) {
					rightdown=0;
				}
			
			}
			
	
			cnt++;
			
			}
		cnt  =1;
		
		
		//左上
		while(board[y-cnt][x-cnt] != 2) {
			if(board[y-cnt][x-cnt]==0) {
				leftup = 0;
				break;
			}
			if(board[y-cnt][x-cnt]==turn) {
				
				break;
			}
			if(board[y-cnt][x-cnt]==turn*-1) {
				leftup++;
				if(board[y-cnt-1][x-cnt-1]==2) {
					leftup=0;
				}
			
			}
			
	
			cnt++;
			
			}
		cnt  =1;
		
		
		//左下
		while(board[y+cnt][x-cnt] != 2) {
			if(board[y+cnt][x-cnt]==0) {
				leftdown = 0;
				break;
			}
			if(board[y+cnt][x-cnt]==turn) {
				
				break;
			}
			if(board[y+cnt][x-cnt]==turn*-1) {
				leftdown++;
				if(board[y+cnt+1][x-cnt-1]==2) {
					leftdown=0;
				}
			
			}
			
			
			cnt++;
			
		    }
		cnt  =1;
		
		//返せる場所がない場合
		if(up==0&&down==0&&right==0&&left==0&&rightup==0&&rightdown==0&&leftup==0&&leftdown==0) {
			judge = true;
		}
		}
		
		//ひっくり返す
		
		
		//置いた場所
			board[y][x] = turn;
		//右
		for(int i = 1;i<right+1;i++) {
			board[y][x+i] = board[y][x+i]*-1;
		}
		
		//左
		for(int i = 1;i<left+1;i++) {
			board[y][x-i] = board[y][x-i]*-1;
		}
		
		//上
		for(int i = 1;i<up+1;i++) {
			board[y-i][x] = board[y-i][x]*-1;
		}
		
		//下
		for(int i = 1;i<down+1;i++) {
			board[y+i][x] = board[y+i][x]*-1;
		}
		
		//右上
		for(int i = 1;i<rightup+1;i++) {
			board[y-i][x+i] = board[y-i][x+i]*-1;
		}
		
		//右下
		for(int i = 1;i<rightdown+1;i++) {
			board[y+i][x+i] = board[y+i][x+i]*-1;
		}
		
		//左上
		for(int i = 1;i<leftup+1;i++) {
			board[y-i][x-i] = board[y-i][x-i]*-1;
		}
		
		//左下
		for(int i = 1;i<leftdown+1;i++) {
			board[y+i][x-i] = board[y+i][x-i]*-1;
		}
		
		up = 0;
		down = 0;
		right = 0;
		left = 0;
		rightup = 0;
		rightdown = 0;
		leftup = 0;
		leftdown = 0;
		
		
		//盤面表示
				for (int i = 1; i <9 ; i++) {
					for (int j = 1; j < 9; j++) {
						if(board[i][j]==1) {
							System.out.print("●");
						}else if(board[i][j] == -1) {
							System.out.print("○");
						}else {
							System.out.print("□");
						}
						
					}
					System.out.println();
				}
				
				
		turn = turn*-1;
		//パスするか否か
		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < 9; j++) {
				judge = false;
				//判別
				if(board[i][j] != 0) {
				judge = true;
			}
			//右
			while(board[i][j+cnt] != 2) {
				if(board[i][j+cnt]==0) {
					right = 0;
					break;
				}
				if(board[i][j+cnt]==turn) {
					
					break;
				}
				if(board[i][j+cnt]==turn*-1) {
					right++;
					if(board[i][j+cnt+1]==2) {
						right=0;
					}
				
				}
				
				cnt++;
				
				}
			cnt  =1;
			
			
			//左
			while(board[i][j-cnt] != 2) {
				if(board[i][j-cnt]==0) {
					left = 0;
					break;
				}
				if(board[i][j-cnt]==turn) {
					
					break;
				}
				if(board[i][j-cnt]==turn*-1) {
					left++;
					if(board[i][j-cnt-1]==2) {
						left=0;
					}
				
				}
				
				
				cnt++;
				
				}
			cnt  =1;
		
			
			//上
			while(board[i-cnt][j] != 2) {
				if(board[i-cnt][j]==0) {
					up = 0;
					break;
				}
				if(board[i-cnt][j]==turn) {
					
					break;
				}
				if(board[i-cnt][j]==turn*-1) {
					up++;
					if(board[i-cnt-1][j]==2) {
						up=0;
					}
				
				}
				
				
				cnt++;
				
				}
			cnt  =1;
		
			
			//下
			while(board[i+cnt][j] != 2) {
				if(board[i+cnt][j]==0) {
					down = 0;
					break;
				}
				if(board[i+cnt][j]==turn) {
					
					break;
				}
				if(board[i+cnt][j]==turn*-1) {
					down++;
					if(board[i+cnt+1][j]==2) {
						down=0;
					}
				
				}
				
				
		
				cnt++;
				
				}
			cnt  =1;
			
			
			//右上
			while(board[i-cnt][j+cnt] != 2) {
				if(board[i-cnt][j+cnt]==0) {
					rightup = 0;
					break;
				}
				if(board[i-cnt][j+cnt]==turn) {
					
					break;
				}
				if(board[i-cnt][j+cnt]==turn*-1) {
					rightup++;
					if(board[i-cnt-1][j+cnt+1]==2) {
						rightup=0;
					}
				
				}
				

		
				cnt++;
				
				}
			cnt  =1;
			
			
			//右下
			while(board[i+cnt][j+cnt] != 2) {
				if(board[i+cnt][j+cnt]==0) {
					rightdown = 0;
					break;
				}
				if(board[i+cnt][j+cnt]==turn) {
					
					break;
				}
				if(board[i+cnt][j+cnt]==turn*-1) {
					rightdown++;
					if(board[i+cnt+1][j+cnt+1]==2) {
						rightdown=0;
					}
				
				}
				
		
				cnt++;
				
				}
			cnt  =1;
			
			
			//左上
			while(board[i-cnt][j-cnt] != 2) {
				if(board[i-cnt][j-cnt]==0) {
					leftup = 0;
					break;
				}
				if(board[i-cnt][j-cnt]==turn) {
					
					break;
				}
				if(board[i-cnt][j-cnt]==turn*-1) {
					leftup++;
					if(board[i-cnt-1][j-cnt-1]==2) {
						leftup=0;
					}
				
				}
				
		
				cnt++;
				
				}
			cnt  =1;
			
			
			//左下
			while(board[i+cnt][j-cnt] != 2) {
				if(board[i+cnt][j-cnt]==0) {
					leftdown = 0;
					break;
				}
				if(board[i+cnt][j-cnt]==turn) {
					
					break;
				}
				if(board[i+cnt][j-cnt]==turn*-1) {
					leftdown++;
					if(board[i+cnt+1][j-cnt-1]==2) {
						leftdown=0;
					}
				
				}
				
				
				cnt++;
				
			    }
			cnt  =1;
			
			
			if(up==0&&down==0&&right==0&&left==0&&rightup==0&&rightdown==0&&leftup==0&&leftdown==0) {
				judge = true;
			}
				
			up = 0;
			down = 0;
			right = 0;
			left = 0;
			rightup = 0;
			rightdown = 0;
			leftup = 0;
			leftdown = 0;
			
			if(judge == false) {
				pass1 = true;
			}
			
			}
		}
		
		//パスの場合
		if(pass1==false) {
			turn = turn*-1;
			
			for (int i = 1; i < 9; i++) {
				for (int j = 1; j < 9; j++) {
					judge = false;
					//判別
					if(board[i][j] != 0) {
					judge = true;
				}
				//右
				while(board[i][j+cnt] != 2) {
					if(board[i][j+cnt]==0) {
						right = 0;
						break;
					}
					if(board[i][j+cnt]==turn) {
						
						break;
					}
					if(board[i][j+cnt]==turn*-1) {
						right++;
						if(board[i][j+cnt+1]==2) {
							right=0;
						}
					
					}
					
					cnt++;
					
					}
				cnt  =1;
				
				
				//左
				while(board[i][j-cnt] != 2) {
					if(board[i][j-cnt]==0) {
						left = 0;
						break;
					}
					if(board[i][j-cnt]==turn) {
						
						break;
					}
					if(board[i][j-cnt]==turn*-1) {
						left++;
						if(board[i][j-cnt-1]==2) {
							left=0;
						}
					
					}
					
					
					cnt++;
					
					}
				cnt  =1;
			
				
				//上
				while(board[i-cnt][j] != 2) {
					if(board[i-cnt][j]==0) {
						up = 0;
						break;
					}
					if(board[i-cnt][j]==turn) {
						
						break;
					}
					if(board[i-cnt][j]==turn*-1) {
						up++;
						if(board[i-cnt-1][j]==2) {
							up=0;
						}
					
					}
					
					
					cnt++;
					
					}
				cnt  =1;
			
				
				//下
				while(board[i+cnt][j] != 2) {
					if(board[i+cnt][j]==0) {
						down = 0;
						break;
					}
					if(board[i+cnt][j]==turn) {
						
						break;
					}
					if(board[i+cnt][j]==turn*-1) {
						down++;
						if(board[i+cnt+1][j]==2) {
							down=0;
						}
					
					}
					
					
			
					cnt++;
					
					}
				cnt  =1;
				
				
				//右上
				while(board[i-cnt][j+cnt] != 2) {
					if(board[i-cnt][j+cnt]==0) {
						rightup = 0;
						break;
					}
					if(board[i-cnt][j+cnt]==turn) {
						
						break;
					}
					if(board[i-cnt][j+cnt]==turn*-1) {
						rightup++;
						if(board[i-cnt-1][j+cnt+1]==2) {
							rightup=0;
						}
					
					}
					

			
					cnt++;
					
					}
				cnt  =1;
				
				
				//右下
				while(board[i+cnt][j+cnt] != 2) {
					if(board[i+cnt][j+cnt]==0) {
						rightdown = 0;
						break;
					}
					if(board[i+cnt][j+cnt]==turn) {
						
						break;
					}
					if(board[i+cnt][j+cnt]==turn*-1) {
						rightdown++;
						if(board[i+cnt+1][j+cnt+1]==2) {
							rightdown=0;
						}
					
					}
					
			
					cnt++;
					
					}
				cnt  =1;
				
				
				//左上
				while(board[i-cnt][j-cnt] != 2) {
					if(board[i-cnt][j-cnt]==0) {
						leftup = 0;
						break;
					}
					if(board[i-cnt][j-cnt]==turn) {
						
						break;
					}
					if(board[i-cnt][j-cnt]==turn*-1) {
						leftup++;
						if(board[i-cnt-1][j-cnt-1]==2) {
							leftup=0;
						}
					
					}
					
			
					cnt++;
					
					}
				cnt  =1;
				
				
				//左下
				while(board[i+cnt][j-cnt] != 2) {
					if(board[i+cnt][j-cnt]==0) {
						leftdown = 0;
						break;
					}
					if(board[i+cnt][j-cnt]==turn) {
						
						break;
					}
					if(board[i+cnt][j-cnt]==turn*-1) {
						leftdown++;
						if(board[i+cnt+1][j-cnt-1]==2) {
							leftdown=0;
						}
					
					}
					
					
					cnt++;
					
				    }
				cnt  =1;
				
				
				if(up==0&&down==0&&right==0&&left==0&&rightup==0&&rightdown==0&&leftup==0&&leftdown==0) {
					judge = true;
				}
					
				up = 0;
				down = 0;
				right = 0;
				left = 0;
				rightup = 0;
				rightdown = 0;
				leftup = 0;
				leftdown = 0;
				
				if(judge == false) {
					pass2 = true;
				}
				
				}
			}
			
		}
		
			
		}
		
		//勝敗判定
		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < 9; j++) {
				if(board[i][j]==1) {
					cntWhite++;
				}else if(board[i][j]==-1) {
					cntBlack++;
				}
				
			}
		}
		
		if(cntWhite>cntBlack) {
			System.out.println(cntWhite + "対" + cntBlack + "で白の勝ち");
		}else if(cntWhite<cntBlack) {
			System.out.println(cntWhite + "対" + cntBlack + "で黒の勝ち");
		}else {
			System.out.println("引き分け");
		}
		
		sc.close();
	}
}








