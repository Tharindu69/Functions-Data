object Bank{

    class Account(id:String,acNumber:Int,bal:Double)
        {
            var nic=id;
            var AccNumber=acNumber;
            var balance=bal;

            override def toString =   "["+nic+":"+AccNumber +":"+ balance+"]"
        }

    def main(args:Array[String])
    {
        var acc1=new Account("NIC123",1001,25000);
		var acc2=new Account("NIC124",1002,10000);
		var acc3=new Account("NIC125",1003,50000);
		var acc4=new Account("NIC126",1004,-1000);
		var acc5=new Account("NIC127",1005,-10000);
		var acc6=new Account("NIC128",1006,0);

		val bank:List[Account]=List(acc1,acc2,acc3,acc4,acc5,acc6);

//FIND ACCOUNT
        println("\n")
        val find = (n: String, b: List[Account]) => b.filter(x=>x.nic.equals(n));
            println("Find Account with NIC \" NIC123\" => " + find("NIC123",bank));
            println("\n")

//ACCOUNTS WITH NEGATIVE BALANCE
        val overdraft = (b: List[Account]) => b.filter(x=>x.balance.<(0))

            println("List of accounts with negative balances => " + overdraft(bank))
            println("\n")

//TOTAL BALANCE
        val bal = (b: List[Account]) => b.reduce((x, y)=>new Account(x.nic,x.AccNumber,x.balance+y.balance))

            println("Total balance of all accounts => " + bal(bank).balance)
            println("\n")

//INTEREST

          val DepInterest=(b: List[Account]) => b.filter(x=>x.balance.>(0)).map(x=>x.balance*10005/10000)
          val OverInterest=(b: List[Account]) => b.filter(x=>x.balance.<(0)).map(x=>x.balance*1001/1000)

            println("After applying deposit interests   => " + DepInterest(bank))
            println("\n")
            println("After applying overdraft interests => " + OverInterest(bank))
            println("\n")
        
    }
}