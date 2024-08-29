public class EjercicioIF {
    float salarioSinAjuste;
    float aumento;
    float salarioConAjuste;

public EjercicioIF(float salarioSinAjuste, float aumento, float salarioConAjuste){
    this.salarioConAjuste = salarioConAjuste;
    this.salarioSinAjuste =salarioSinAjuste;
    this.aumento = aumento;
}
public float calcularSalario(){

   if (salarioSinAjuste<1300606) {
    salarioConAjuste=salarioSinAjuste+(salarioSinAjuste*aumento);
   }else{
    salarioConAjuste=salarioSinAjuste;
   }
   return salarioConAjuste;
}
}