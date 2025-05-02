<!-- Dummy content for search_skill.jsp -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Search Skill - SkillBridge</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <div class="search-skill-container">
        <h2>Search for Skills</h2>
        <form action="SearchSkillServlet" method="post">
            <input type="text" name="keyword" placeholder="Search Skills..." required><br>
            <button type="submit">Search</button>
        </form>
        <div class="skills-list">
            <!-- Skills will be displayed here after search -->
        </div>
    </div>
</body>
</html>
