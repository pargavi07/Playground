#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
int tb,tr,r,b,rem;
float of,to,cr,trr;
std:;cin>>tb>>tr>>r>>b;
to=tb/6;
rem=b%6;
of=(b/6)+(rem*0.1);
cr=r/of;
trr=tr/to;
std::cout<<to<<"\n";
std::cout<<of;
std::cout<<fixed<<setprecision(1)<<"\n"<<cr;
std::cout<<"\n"<<trr;
if(cr>trr)
 std::cout<<"\n"<<"Eligible to Win";
  else
  std::cout<<"\n"<<"Not Eligible to Win";
return 0;
}




