curl -X 'GET' \
  'https://six.openemr.io/openemr/apis/default/fhir/Patient?_id=dd&identifier=rt&name=assert&birthdate=12-11&gender=male' \
  -H 'accept: application/json'
  
curl -X POST -k -H 'Content-Type: application/x-www-form-urlencoded'
-i 'https://localhost:9300/oauth2/default/token'
--data 'grant_type=password
&client_id=LnjqojEEjFYe5j2Jp9m9UnmuxOnMg4VodEJj3yE8_OA
&scope=openid%20offline_access%20api%3Aport%20api%3Afhir%20patient%2Fencounter.read%20patient%2Fpatient.read%20patient%2FAllergyIntolerance.read%20patient%2FCareTeam.read%20patient%2FCondition.read%20patient%2FCoverage.read%20patient%2FEncounter.read%20patient%2FImmunization.read%20patient%2FMedication.read%20patient%2FMedicationRequest.read%20patient%2FObservation.read%20patient%2FPatient.read%20patient%2FProcedure.read
&user_role=patient
&username=Phil1
&password=phil
&email=heya@invalid.email.com'
