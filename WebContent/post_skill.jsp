<!-- Dummy content for post_skill.jsp -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Post Skill - SkillBridge</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <div class="post-skill-container">
        <h2>Post a New Skill</h2>
        <form action="PostSkillServlet" method="post">
            <input type="text" name="skillName" placeholder="Skill Name" required><br>
            <textarea name="description" placeholder="Skill Description" required></textarea><br>
            <button type="submit">Post Skill</button>
        </form>
    </div>
</body>
</html>
