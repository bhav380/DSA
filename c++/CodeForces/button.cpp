

#include <bits/stdc++.h>

using namespace std;


void buttonsGame(int a,int b,int c){
    
    int rem = c%2;
    
    if(rem==1 && a==b){
        
            cout<<"First"<<endl;
            
            return;
     
    }else if(a==b){
        
        cout<<"Second"<<endl;
        return;
    }
    
    
    if(a<b){
        cout<<"Second"<<endl;
    }else{
        cout<<"First"<<endl;
    }
    
    
    
    
    
}

int main()
{
    
    int t;
    cin>>t;
    
    for(int i=0; i<t; i++){
        int a,b,c;
        cin>>a>>b>>c;
        
        buttonsGame(a,b,c);
    }
   
}
