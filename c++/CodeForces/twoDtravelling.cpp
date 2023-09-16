

#include <bits/stdc++.h>

using namespace std;

long twodTraveling(int data[][2],int n,int k,int a,int b,bool visited[]){
    
    
   
    
    
    if((a<=k && b<=k) || a==b){
        return 0;
    }
    
    visited[a] = true;
    
    long ans = LONG_MAX;
    

    
    for(int i=1; i<=n; i++){
        
        if(!visited[i]){
            
            if(a<=k && i<=k){
                long x = twodTraveling(data,n,k,i,b,visited);

                if(ans>x){
                    ans = x;
                }
            }else{


                long y1 = long(data[i][0])-long(data[a][0]);
                 long y2 = long(data[i][1])-long(data[a][1]);
                 
                 cout<<y1<<" y1 , y2 : "<<y2<<endl;


                long d1 = labs(y1);

                long d2 = labs(y2);

                cout<<d1<<" d1 , d2 : "<<d2<<endl;

                long val = (long)(d1) + d2;

                cout<<val<<" val"<<endl;
                
               
                long x = val + long(twodTraveling(data,n,k,i,b,visited));

                cout<<x<<" x"<<endl;

                if(ans>x){
                    ans =x;
                }

            }
            
        }
    }
    
    if(ans==LONG_MAX){
        return 0;
    }
    
    return ans;
    
    
}



int main()
{
    
    int t;
    cin>>t;
    
    for(int i=0; i<t; i++){
        int n,k,a,b;
        
        cin>>n>>k>>a>>b;
        
        int data[n+1][2];
        
        for(int j=1; j<=n; j++){
            cin>>data[j][0]>>data[j][1];
        }
        
        bool visited[n+1] = {0};
    
 
        
        long ans = twodTraveling(data,n,k,a,b,visited);
        cout<<ans<<endl;
    }
  
   

   
}
