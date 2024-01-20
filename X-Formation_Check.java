import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char mat[][]={{'x','o','o','o','x'},{'o','x','o','x','o'},{'s','o','x','o','o'},{'o','x','o','x','o'},{'x','o','o','o','x'}};
		String s=Mainish(mat,n);
		System.out.println(s);
	}

public static String Mainish(char mat[][],int n)
{
		char dia=mat[0][0];
		char a_dia=mat[0][1];
		if(dia==a_dia)
		{
		    return "No";
		}
		else
		{
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            if(i==j || i+j==n-1)
		            {
		                if(mat[i][j]!=dia)
		                {
		                    return "No";
		                }
		            }
		            else{
		                if(mat[i][j]!=a_dia)
		                {
		                    return "No";
		                }
		            }
		        }
		    }
		}
		return "Yes";
		
}
}
