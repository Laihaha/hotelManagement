package hotel;

public class Login_Register {

	private String[][] array_list = new String[100][2];
	private int i = 0;
	
	
	
	public String register(String username,String key) {
		String result;
		boolean bool = true;
		
		for(int j = 0; j < i; j++) {
			if(array_list[j][0] == username && array_list[j][1] == key) {
				bool = false;
			}
		}
		
		if(bool == true) {
			array_list[i][0] = username;
			array_list[i][1] = key;
			i++;
			result = "ע��ɹ�!";
		} else {
			result = "ע��ʧ��!";
		}
		return result;
		
	}
	
	public String login(String username,String key) {
		
		String result;
		boolean bool = false;
		for(int j = 0; j < i; j++) {
			if( array_list[j][0] == username && array_list[j][1] == key ) {
				bool = true;
			}
		}
		
		if(bool == true) {
			result = "��¼�ɹ�!";
		} else {
			result = "��¼ʧ��!";
		}
		return result;
	}
	
	
}
