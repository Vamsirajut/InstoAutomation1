$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OCPAssessorsApproveSubmission.feature");
formatter.feature({
  "line": 2,
  "name": "Assessor Approve Submission",
  "description": "",
  "id": "assessor-approve-submission",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "System Admin creates new Customer Profile and gives  permission for Assessors",
  "description": "",
  "id": "assessor-approve-submission;system-admin-creates-new-customer-profile-and-gives--permission-for-assessors",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User clicks on Create button in OCP home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters razor id and customer name",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User clicks on create button of new profile page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify Draft user profile is created",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User Clicks on permission button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Adds Writer with write permission",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on save button after giving write permissions",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Adds Reader with read permission",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on save after giving Read permissions",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Adds Approver1 with Approver permission",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click on save button after giving Approver1 as Approve",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Adds Approver2 with Approver permission",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "click on save button after giving Approver2 as Approve",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Adds Approver3 with Approver permission",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "click on save button after giving Approver3 as Approve",
  "keyword": "Then "
});
formatter.match({
  "location": "CreatenewprofileCurrentversion.user_clicks_on_Create_button_in_OCP_home_page()"
});
formatter.result({
  "duration": 14290925153,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewprofileCurrentversion.user_enters_razor_id_and_customer_name()"
});
formatter.result({
  "duration": 590176111,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewprofileCurrentversion.user_clicks_on_create_button()"
});
formatter.result({
  "duration": 149808267,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewprofileCurrentversion.verify_Draft_user_is_created()"
});
formatter.result({
  "duration": 419418542,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewprofileCurrentversion.click_on_permission_button()"
});
formatter.result({
  "duration": 5194702262,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewprofileCurrentversion.Adds_with_write_permission()"
});
formatter.result({
  "duration": 11926477198,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewprofileCurrentversion.click_on_save_button_after_giving_write_permissions()"
});
formatter.result({
  "duration": 10141240037,
  "status": "passed"
});
formatter.match({
  "location": "OCPCreateProfileAssesors.adds_Reader_with_read_permission()"
});
formatter.result({
  "duration": 16657449226,
  "status": "passed"
});
formatter.match({
  "location": "OCPCreateProfileAssesors.click_on_save_after_giving_Read_permissions()"
});
formatter.result({
  "duration": 10156082197,
  "status": "passed"
});
formatter.match({
  "location": "OCPCreateProfileAssesors.Adds_Approver1_with_Approver_permission()"
});
formatter.result({
  "duration": 11670276843,
  "status": "passed"
});
formatter.match({
  "location": "OCPCreateProfileAssesors.click_on_save_button_after_giving_Approver1_asApprove()"
});
formatter.result({
  "duration": 10167572604,
  "status": "passed"
});
formatter.match({
  "location": "OCPCreateProfileAssesors.Adds_Approver2_with_Approver_permission()"
});
formatter.result({
  "duration": 11926701683,
  "status": "passed"
});
formatter.match({
  "location": "OCPCreateProfileAssesors.click_on_save_button_after_giving_Approver2_asApprove()"
});
formatter.result({
  "duration": 10172719264,
  "status": "passed"
});
formatter.match({
  "location": "OCPCreateProfileAssesors.Adds_Approver3_with_Approver_permission()"
});
formatter.result({
  "duration": 11711794843,
  "status": "passed"
});
formatter.match({
  "location": "OCPCreateProfileAssesors.click_on_save_button_after_giving_Approver3_asApprove()"
});
formatter.result({
  "duration": 6504460357,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Login as Writer and submits the profile for submission",
  "description": "",
  "id": "assessor-approve-submission;login-as-writer-and-submits-the-profile-for-submission",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "Login as Writer to OCP Application",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "Writer Searches for the profile on OCP Homepage",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Writer Clicks on the Profile from the OCP dashboard",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Draft profile page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Writer clicks on new submission icon",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "WIP OCP Profile page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Writer enters the Submission Title and Adds participants",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "Writer fills in the profile details",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "writer clicks on save and submit button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Verify if Pending submission page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Writer verifies if approvers are displayed and Recall close buttons are present",
  "keyword": "And "
});
formatter.match({
  "location": "CreatenewprofileCurrentversion.login_as_Writer_to_OCP_Application()"
});
formatter.result({
  "duration": 16787945036,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewprofileCurrentversion.writer_Searches_for_the_profile_on_OCP_Homepage()"
});
formatter.result({
  "duration": 6065128148,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewprofileCurrentversion.writer_Clicks_on_the_Profile_from_the_OCP_dashboard()"
});
formatter.result({
  "duration": 10126479331,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewprofileCurrentversion.draft_page_is_displayed()"
});
formatter.result({
  "duration": 34425,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewprofileCurrentversion.writer_clicks_on_new_submission_icon()"
});
formatter.result({
  "duration": 5141014098,
  "status": "passed"
});
formatter.match({
  "location": "CreatenewprofileCurrentversion.WIP_OCP_Profile_page_is_displayed()"
});
formatter.result({
  "duration": 5099117917,
  "status": "passed"
});
formatter.match({
  "location": "OCPCreateProfileAssesors.Writer_enters_the_Submission_Title_and_Adds_participants()"
});
formatter.result({
  "duration": 40701997525,
  "status": "passed"
});
formatter.match({
  "location": "OCPCreateProfileAssesors.writer_fills_in_the_profile_details()"
});
