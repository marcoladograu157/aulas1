public class Professor {
    public double t_al;
    public  double t_ap;
    public double t_aula;

    public Professor(double t_al,double t_ap,double t_aula){
        this.t_al = t_al;
        this.t_ap = t_ap;
        this.t_aula = t_aula;

    }
    public void promover(){
        if(t_ap/t_al*100>75){
            System.out.println("professor Promovido");
        }else{
            System.out.println("Professor sem promoção");
        }
    }
        public void bonificar(){
        if(t_aula>=30){
            System.out.println("Ganhar bonificação");
        }
        }

}
