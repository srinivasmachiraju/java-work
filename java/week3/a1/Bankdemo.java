/*
m.s.srinivas
am.en.u4cse16506
cse c*/

class Bankerdemo{
public static void main(String[] args){
Banker b1=new Banker();
b1.deposit();
b1.credit();
b1.display();
Banker b=new Banker(1500);
b.deposit();
b.credit();
b.display();
}
}
