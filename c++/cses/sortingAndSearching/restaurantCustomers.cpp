

// Sweep Line  algo

#include <bits/stdc++.h>

using namespace std;

int main()
{
    
    int n;
    cin>>n;
    int a[n],b[n];
    
    for(int i=0; i<n; i++){
     
        cin>>a[i]>>b[i];

    }
    
    sort(a,a+n);
    sort(b,b+n);
    
    int count =0;
    int lIndex = 0;
    int maxCount = 0;
    
    for(int i=0; i<n; i++){
        
        while(b[lIndex]<=a[i]){
            count--;
            lIndex++;
        }
        
        count++;
        
        maxCount = max(maxCount,count);
        
    }
    
    
    cout<<maxCount;
    
    
    
    
    
    
    
    

    return 0;
}
