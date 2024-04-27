public class Mean {
    public static void main(String[] args) {
        String querySQL = """
            SELECT u.username, COUNT(*) as num_posts
            FROM users u 
            PŘIPOJTE SE k příspěvkům p ON u.id = p.user_id 
            WHERE p.published_at >= '2022-01-01' 
            GROUP BY u.username 
            HAVING COUNT(*) > 10 
            ORDER BY num_posts DESC 
            LIMIT 10; """;
        System.out.println(querySQL);
    }
}
