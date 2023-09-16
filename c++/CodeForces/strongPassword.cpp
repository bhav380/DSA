
#include <bits/stdc++.h>

using namespace std;


void helper(string str,int m,unordered_map<string,bool> &map,string sequence){
    
    if(m==0){
        
        
       map[sequence] = true;
        return;
    }
    
    if(str.length()==0){
        return;
    }
    
    helper(str.substr(1,str.length()),m-1,map,sequence+str[0]);
    helper(str.substr(1,str.length()),m,map,sequence);
    
    
    
}

bool check(string lower,string upper,int i,unordered_map<string,bool> &map,int m,string pass){
    
    if(i==m){
        
        
        if(map.find(pass)==map.end()){
            
            return true;
            
            
        }
        return false;
    }
    
    
    int lb = lower[i]-'0';
    int ub = upper[i]-'0';
    
    
    for(int j=lb; j<=ub; j++){
        
        if(check(lower,upper,i+1,map,m,pass+char(j+48))){
            return true;
        }
    }
    
    return false;
}



void strongPassword(string str,string lower,string upper,int m){
    
    
    unordered_map<string,bool> map;
    
    helper(str,m,map,"");
    
 
    
    if(check(lower,upper,0,map,m,"")){
        cout<<"YES"<<endl;
    }else{
        cout<<"NO"<<endl;
    }
    
}



int main(){
    
    int t;
    cin>>t;
    
    for(int i=0; i<t; i++){
        string str;
        string lower;
        string upper;
        int m;
        cin>>str;
        cin>>m;
        cin>>lower;
        cin>>upper;
        
        strongPassword(str,lower,upper,m);
        
    }
}