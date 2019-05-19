package p1;
interface RowMapper{
	void mapRow();
}
class JdbcTemplate{
	void execute(RowMapper ref) {
		ref.mapRow();
	}
}
public class Main {
	public static void main(String[] args) {
		JdbcTemplate jt = new JdbcTemplate();
//		RowMapper rm = new RowMapper() {
//			public void mapRow() {
//				System.out.println("okkk again");
//			}
//		};
//		jt.execute(rm);
		
		jt.execute(new RowMapper() {
			public void mapRow() {
				System.out.println("okkk return");
			}
		});
		
		
	}

}
