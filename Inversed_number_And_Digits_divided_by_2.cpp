#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n,ans=0;
    cout<<"Enter a number : ";
    cin>>n;
    while(n>0)
    {
        ans=ans*10+(n%10)/2;
        n=n/10;
    }
    cout<<"Inversed number and each digit divided by 2 is : "<<ans;
 return 0;
}
