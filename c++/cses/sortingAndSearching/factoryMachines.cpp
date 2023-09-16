

#include <bits/stdc++.h>


using namespace std;


bool valid(long long int processTime,int t,int arr[],int n){
    
    long long int sum = 0;
    
    for(int i=0; i<n; i++){
        sum+= (processTime/arr[i]);
    }
    
    if(sum>=t){
        return true;
    }
    
    return false;
    
}


int main()
{
    
    int n,t;
    cin>>n>>t;
    
    int arr[n];
    
    long long int minVal = LONG_MAX;
    
    for(int i=0;i<n; i++){
        cin>>arr[i];
        minVal = min<long long int>(minVal,arr[i]);
    }
    
    
    long long int z = (long long int)(minVal)*t;
    long long int x = (long long int)(-1);
    
    for(long long int b=z; b>=1; b/=2){

        while(!valid(x+b,t,arr,n)){
            x+=b;
        }
    }
    
    cout<<x+1;
    
}
