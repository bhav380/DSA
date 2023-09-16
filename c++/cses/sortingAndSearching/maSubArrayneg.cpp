/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <bits/stdc++.h>

using namespace std;

int main()
{
    
    int n;
    cin>>n;
    
    int arr[n];
    
    cin>>arr[0];
    long long sum=arr[0];
    long long maxSum = arr[0];
    
    for(int i=1; i<n; i++){
        cin>>arr[i];
        sum = max<long long int>(arr[i],arr[i]+sum);
        
        maxSum = max(maxSum,sum);
    }
    
    
    cout<<maxSum;
    
    
    

    return 0;
}
