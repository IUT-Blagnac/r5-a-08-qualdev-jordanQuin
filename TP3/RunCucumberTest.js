import { exec } from 'child_process';

exec('cucumber-js', (error, stdout, stderr) => {
  if (error) {
    console.error(`Erreur: ${error.message}`);
    return;
  }
  if (stderr) {
    console.error(`stderr: ${stderr}`);
    return;
  }
  console.log(`stdout: ${stdout}`);
});

