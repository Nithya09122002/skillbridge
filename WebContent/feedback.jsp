<!-- Dummy content for feedback.jsp -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Feedback - SkillBridge</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <div class="feedback-container">
        <h2>Give Feedback</h2>
        <form action="FeedbackServlet" method="post">
            <textarea name="feedback" placeholder="Leave your feedback here..." required></textarea><br>
            <button type="submit">Submit Feedback</button>
        </form>
    </div>
</body>
</html>
