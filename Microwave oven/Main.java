#include<iostream>
using namespace std;
int main()
{
  int n;float time;
  std :: cin>>n>>time;
  if(n>3){
    std :: cout<<"Number of items is more";
    return 0;
  }
  if(n==2)
    std :: cout<<time+(time/2);
  else
    std :: cout<<time+time;//Type your code here.
}