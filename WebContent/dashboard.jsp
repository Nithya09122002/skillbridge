<!-- Dummy content for dashboard.jsp -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard - SkillBridge</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <div class="dashboard-container">
        <h2>Welcome, ${user.username}!</h2>
        <nav>
            <a href="post_skill.jsp">Post a Skill</a>
            <a href="search_skill.jsp">Search Skills</a>
            <a href="session_requests.jsp">Session Requests</a>
            <a href="feedback.jsp">Give Feedback</a>
            <a href="chat.jsp">Chat</a>
        </nav>
        <a href="logout.jsp">Logout</a>
    </div>
</body>
</html>
