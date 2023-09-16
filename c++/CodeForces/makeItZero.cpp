

#include <bits/stdc++.h>

using namespace std;


void makeItZero(int arr[],int n){
    
   
    
    int s= arr[0];

    bool flag = false;

    if(arr[0]!=0){
        flag=true;
    }
    
    for(int i=1; i<n; i++){

        if(arr[i]!=0){
            flag=true;

        }
        
        s = s^arr[i];
    }

    if(!flag){
        cout<<0<<endl;
        return;
    }else if(s==0){
        cout<<1<<endl;
        cout<<1<<" "<<n<<endl;
        return;
    }else if(n%2==0){
        cout<<2<<endl;
        cout<<1<<" "<<n<<endl;
        cout<<1<<" "<<n<<endl;
    }else{

        cout<<4<<endl;
        cout<<1<<" "<<n<<endl;
        cout<<1<<" "<<n-1<<endl;

        cout<<n-1<<" "<<n<<endl;
        cout<<n-1<<" "<<n<<endl;


    }

}

int main()
{
    
    int t;
    cin>>t;
    
    for(int i=0; i<t; i++){
        int n;
        cin>>n;
        
        int arr[n];
        
        for(int j=0; j<n; j++){
            cin>>arr[j];
        }
        
        makeItZero(arr,n);
    }
   

   
}
