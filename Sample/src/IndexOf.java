class IndexOf {
	public static void main(String args[]) {
		String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		int idx = -1;
		int count = 0;
		
		while(true) {
			idx = str.indexOf("e", idx + 1);
			if(idx == -1) {
				break ;
		}
			count++;
	}
		System.out.println(count);
		
		
	}
}
		
		
		/*String str = "Java 개발자 양성을 통한 취업연계과정!!";
		int idx = -1;
		int count = 0;
		
		while(true) {
			idx = str.indexOf(" ", idx + 1);
			if(idx == -1) {
				break;
			}
			count++;
		}
		System.out.println(count);
	}
}*/
