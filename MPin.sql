use MPIN;
SELECT * FROM client_details;
INSERT INTO client_details 
(id, team_name, team_dl, application_name, service_id, description, Average_Traffic, Peak_Traffic, Peak_Traffic_Hrs)
VALUES
(1, 'Team Alpha', 'team.alpha@example.com', 'Application A', 'service123', 'Handles user authentication', 'Medium', '100 TPS', '18:00-21:00'),
(2,'Team Beta', 'team.beta@example.com', 'Application B', 'service456', 'Processes payments', 'High', '250 TPS', '12:00-15:00'),
(3,'Team Gamma', 'team.gamma@example.com', 'Application C', 'service789', 'Data analytics team', 'Low', '50 TPS', '20:00-22:00');
ALTER TABLE client_details MODIFY id INT NOT NULL AUTO_INCREMENT;

