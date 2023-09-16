
#include <bits/stdc++.h>

using namespace std;


void assembleMinimums(int n, int b[] ,int size){
    
    sort(b,b+size);
    
    int a[n];
    
    int indexb = 0;
    int indexa = 0;
    int remLen = n;
    
    
    while(indexb!=size){
        
        
        a[indexa++] = b[indexb];
        
        remLen--;
        
        indexb+=remLen;
    
    }
    
    if(indexa!=n){
        a[indexa] = a[indexa-1];
    }
    
    
    for(int i=0; i<n; i++){
        cout<<a[i]<<" ";
    }
    
    cout<<endl;
    
    
    
    
    
}

int main(){
    
    int t;
    cin>>t;
    
    for(int i=0; i<t; i++){
        
        
        int n;
        cin>>n;
        
        int size = n*(n-1)/2;
        
        int b[size];
        
        
        for(int j=0; j<size; j++){
            cin>>b[j];
        }
        
        assembleMinimums(n,b,size);
        
        
    }
    
   
    
}
