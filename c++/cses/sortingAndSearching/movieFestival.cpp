// Scheduling algo

#include <bits/stdc++.h>

using namespace std;


bool comp(pair<int,int> a,pair<int,int> b){
    if(a.second==b.second){
        
        return a.first>b.first;
        
    }else{
        
        return a.second>b.second;
        
    }
}

int main()
{
    
    int n;
    cin>>n;
    
    vector<pair<int,int>> v;
    
    for(int i=0; i<n; i++){
        pair<int,int> p;
        cin>>p.first>>p.second;
        
        v.push_back(p);
    }
    
    sort(v.begin(),v.end(),comp);
    
    
    
    int maxCount=1;
    
   
    
    pair<int,int> curr = v[0];
    
    
    for(int i=1; i<n; i++){
        
        if(v[i].first>curr.first){
            curr = v[i];
        }else if(v[i].second<=curr.first){
            maxCount++;
            curr=v[i];
        }
        
    }
    
    cout<<maxCount;

    
    
    
    
    
    
    
    
    

    return 0;
}
