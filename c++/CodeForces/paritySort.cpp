
#include<bits/stdc++.h>

using namespace std;

void isIncreasing(int arr[],int n){
    
    int tmp[n];
    
    for(int i=0; i<n; i++){
        tmp[i] = arr[i];
    }
    
    sort(tmp,tmp+n);
    
    for(int i=0; i<n; i++){
        
        if(tmp[i]%2==0) {
				
				if(arr[i]%2!=0) {
					cout<<"NO"<<endl;
					return;
				}
			}else if(tmp[i]%2!=0) {
				if(arr[i]%2==0) {		
					cout<<"NO"<<endl;
					return;		
			}
		}
    }
    
    cout<<"YES"<<endl;
    
    
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
        
        isIncreasing(arr,n);
    }
}
