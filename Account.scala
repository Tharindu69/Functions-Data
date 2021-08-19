object Account{
  def main(args:Array[String])
  {
        class account(id:String,n:Int,b:Double)
        {
            val nic:String=id 
            val acnumber: Int = n 
            var  balance: Double = b


//TRANSFER
            def transfer(a:account,b:Double)=
            {
                this.balance=this.balance-b
                a.balance=a.balance+b
            }
            
        
            override def toString =   "["+nic+":"+acnumber +":"+ balance+"]"
        }


    val p=new account("NIC0001",101,10000)
    val q=new account("NIC0002",102,60000)
    val r=new account("NIC0003",103,5000)
    
    println("\n")
    println("Before transfering balance of q account : "+q.balance)
    println("Before transfering balance of p account : "+p.balance)
    println("\n")

    val t=p.transfer(q,5000)
    println("New balance of q account:"+q.balance)
    println("New balance of p account:"+p.balance)
    println("\n")
  }
}