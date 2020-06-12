#include<iostream>
using namespace std;
int main()
{
  int r,c,t;std :: cin>>r>>c>>t;
  if((t>=r && t<=(2*r))||(t<=(r*(r-1)) &&t>=(r*(r-2))))
    std :: cout<<"It is a mango tree";
  else
    std :: cout<<"It is not a mango tree";//Type your code here.
}