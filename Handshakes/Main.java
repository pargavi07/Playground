#include<iostream>
using namespace std;
int main()
{
  int a,ans=0;
  std :: cin>>a;
  a-=1;
  while(a>0){
    ans+=a;
    a--;}
  std :: cout<<ans;//Type your code here.
}