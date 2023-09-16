#include <bits/stdc++.h>

using namespace std;


int main(){
    
    int n,m,a;
    long long x1,x2,ans;
    
    cin>>n>>m>>a;
    
  x1 = n/a;
    
    if(n%a!=0){
        x1++;
    }
    
 x2 = m/a;
    
    if(m%a!=0){
        x2++;
    }
    
    ans = x1*x2;
    
    cout<<(ans);
    
}
