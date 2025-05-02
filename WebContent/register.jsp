<!-- Dummy content for register.jsp -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register - SkillBridge</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <div class="register-container">
        <h2>Register for SkillBridge</h2>
        <form action="RegisterServlet" method="post">
            <input type="text" name="username" placeholder="Username" required><br>
            <input type="email" name="email" placeholder="Email" required><br>
            <input type="password" name="password" placeholder="Password" required><br>
            <button type="submit">Register</button>
        </form>
        <p>Already have an account? <a href="login.jsp">Login here</a></p>
    </div>
</body>
</html>
