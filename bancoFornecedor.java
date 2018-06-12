import java.util.*;
public class bancoFornecedor {

	


	public static bancoFornecedor getINSTANCE() {
		return bancoFornecedor.INSTANCE;
	}


	public static void setINSTANCE(bancoFornecedor iNSTANCE) {
		INSTANCE = iNSTANCE;
	}


	public static ArrayList<clsFornecedor> objeto = new ArrayList<clsFornecedor>();
	
    private static bancoFornecedor INSTANCE = new bancoFornecedor();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
