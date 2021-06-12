private BufferedWriter bufferedWriter;

	public ErlangBaseListener(BufferedWriter bufferedWriter) { this.bufferedWriter = bufferedWriter;}

	private void writeBuf(String s, int tabCount) {
		for(int i =0; i<tabCount; i++){
			try {
				bufferedWriter.write("\t");
			} catch(IOException e){
				e.printStackTrace();
			}
		}
		try {
			bufferedWriter.write(s);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}