object Rational{


    class Rational(n:Int, d:Int)
    {

        require(d>0,"d must be grater than 0")

        val numer = n/gcd(Math.abs(n),d)
        val denom = d/gcd(Math.abs(n),d)
        def this(n:Int)=this(n,1)

        private def gcd(a:Int, b:Int):Int = if(b==0) a else gcd(b,a%b)


        def +(r:Rational) = new Rational(this.numer*r.denom+this.denom*r.numer,
        this.denom*r.denom)
// NEG
        def neg=new Rational(-this.numer,this.denom)

// SUB

        def -(r:Rational)=this + r.neg

//less

        def less (that:Rational) = this.numer * that.denom < this.denom*that.numer
// MAX

        def max(that:Rational) = if(this.less(that)) that else this

        override def toString = numer+"/"+denom
    }



    def main(args:Array[String])
    {
        val r1 = new Rational(2)
        val r2 = new Rational(6,8)
        val r3 = new Rational(1,3)
        val x = r2-r3;

        println("\n\nNEG METHOD FOR "+r2+" => "+r2.neg);
        println("\nSUB METHOD FOR "+r2+"and "+r3+ " => "+x);
        
        print("\n")
    }

}





