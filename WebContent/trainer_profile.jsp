<!-- Dummy content for trainer_profile.jsp -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trainer Profile - SkillBridge</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <div class="trainer-profile-container">
        <h2>${trainer.username}'s Profile</h2>
        <p>Skills: ${trainer.skills}</p>
        <p>Experience: ${trainer.experience}</p>
        <a href="request_session.jsp">Request a Session</a>
    </div>
</body>
</html>
