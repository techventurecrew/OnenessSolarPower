package com.solar.utility;

public class Data {
    public static String getMessageBody(String user,String OTP){
        return "<!DOCTYPE html>\n" +
        "<html lang=\"en\">\n" +
        "<head>\n" +
        "    <meta charset=\"UTF-8\">\n" +
        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
        "    <title>OTP Verification</title>\n" +
        "    <style>\n" +
        "        body {\n" +
        "            font-family: Arial, sans-serif;\n" +
        "            margin: 0;\n" +
        "            padding: 0;\n" +
        "            background-color: #f4f7fa;\n" +
        "            color: #333;\n" +
        "        }\n" +
        "        .email-container {\n" +
        "            width: 100%;\n" +
        "            max-width: 600px;\n" +
        "            margin: 0 auto;\n" +
        "            background-color: #ffffff;\n" +
        "            border-radius: 8px;\n" +
        "            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);\n" +
        "        }\n" +
        "        .email-header {\n" +
        "            background-color: #0056b3;\n" +
        "            color: #ffffff;\n" +
        "            padding: 20px;\n" +
        "            text-align: center;\n" +
        "            border-radius: 8px 8px 0 0;\n" +
        "        }\n" +
        "        .email-header h1 {\n" +
        "            margin: 0;\n" +
        "            font-size: 24px;\n" +
        "        }\n" +
        "        .email-body {\n" +
        "            padding: 20px;\n" +
        "            text-align: center;\n" +
        "        }\n" +
        "        .otp {\n" +
        "            font-size: 32px;\n" +
        "            font-weight: bold;\n" +
        "            color: #0056b3;\n" +
        "        }\n" +
        "        .email-footer {\n" +
        "            background-color: #f1f1f1;\n" +
        "            text-align: center;\n" +
        "            padding: 15px;\n" +
        "            font-size: 14px;\n" +
        "            color: #777;\n" +
        "            border-radius: 0 0 8px 8px;\n" +
        "        }\n" +
        "        .footer-link {\n" +
        "            color: #0056b3;\n" +
        "            text-decoration: none;\n" +
        "        }\n" +
        "        .footer-link:hover {\n" +
        "            text-decoration: underline;\n" +
        "        }\n" +
        "    </style>\n" +
        "</head>\n" +
        "<body>\n" +
        "    <div class=\"email-container\">\n" +
        "        <div class=\"email-header\">\n" +
        "            <h1>OTP Verification for Oneness</h1>\n" +
        "        </div>\n" +
        "        <div class=\"email-body\">\n" +
        "            <h2>Dear "+ user +",</h2>\n" +
        "            <p>We received a request to verify your email for your Oneness. Please use the following One-Time Password (OTP) to complete your verification:</p>\n" +
        "            <p class=\"otp\">"+OTP+"</p>\n" +
        "            <p>This OTP is valid for 10 minutes. If you did not request this, please disregard this message.</p>\n" +
        "            <p>If you have any questions or need assistance, feel free to <a href=\"mailto:support@Oneness.com\" class=\"footer-link\">contact our support team</a>.</p>\n" +
        "        </div>\n" +
        "        <div class=\"email-footer\">\n" +
        "            <p>&copy; 2025 Oneness. All rights reserved.</p>\n" +
        "            <p><a href=\"\" class=\"footer-link\">Terms of Service</a> | <a href=\"\" class=\"footer-link\">Privacy Policy</a></p>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "</body>\n" +
        "</html>";
    
    }

    public static String getVerificationEmailBody(String user, String OTP) {
        return "<!DOCTYPE html>\n" +
        "<html lang=\"en\">\n" +
        "<head>\n" +
        "    <meta charset=\"UTF-8\">\n" +
        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
        "    <title>Email Verification</title>\n" +
        "    <style>\n" +
        "        body {\n" +
        "            font-family: Arial, sans-serif;\n" +
        "            margin: 0;\n" +
        "            padding: 0;\n" +
        "            background-color: #f4f7fa;\n" +
        "            color: #333;\n" +
        "        }\n" +
        "        .email-container {\n" +
        "            width: 100%;\n" +
        "            max-width: 600px;\n" +
        "            margin: 0 auto;\n" +
        "            background-color: #ffffff;\n" +
        "            border-radius: 8px;\n" +
        "            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);\n" +
        "        }\n" +
        "        .email-header {\n" +
        "            background-color: #28a745;\n" +
        "            color: #ffffff;\n" +
        "            padding: 20px;\n" +
        "            text-align: center;\n" +
        "            border-radius: 8px 8px 0 0;\n" +
        "        }\n" +
        "        .email-header h1 {\n" +
        "            margin: 0;\n" +
        "            font-size: 24px;\n" +
        "        }\n" +
        "        .email-body {\n" +
        "            padding: 20px;\n" +
        "            text-align: center;\n" +
        "        }\n" +
        "        .verify-button {\n" +
        "            display: inline-block;\n" +
        "            margin-top: 20px;\n" +
        "            padding: 12px 24px;\n" +
        "            background-color: #28a745;\n" +
        "            color: white;\n" +
        "            text-decoration: none;\n" +
        "            border-radius: 6px;\n" +
        "            font-size: 16px;\n" +
        "        }\n" +
        "        .email-footer {\n" +
        "            background-color: #f1f1f1;\n" +
        "            text-align: center;\n" +
        "            padding: 15px;\n" +
        "            font-size: 14px;\n" +
        "            color: #777;\n" +
        "            border-radius: 0 0 8px 8px;\n" +
        "        }\n" +
        "        .footer-link {\n" +
        "            color: #28a745;\n" +
        "            text-decoration: none;\n" +
        "        }\n" +
        "        .footer-link:hover {\n" +
        "            text-decoration: underline;\n" +
        "        }\n" +
        "    </style>\n" +
        "</head>\n" +
        "<body>\n" +
        "    <div class=\"email-container\">\n" +
        "        <div class=\"email-header\">\n" +
        "            <h1>Verify Your Email - Oneness</h1>\n" +
        "        </div>\n" +
        "        <div class=\"email-body\">\n" +
        "            <h2>Hello " + user + ",</h2>\n" +
        "            <p>Thank you for signing up with Oneness. To complete your verification, please verify your email address by clicking the button below:</p>\n" +
        "            <p class=\"otp\">"+OTP+"</p>\n" +
        "            <p>If you did not create this account, you can ignore this email.</p>\n" +
        "            <p>If you have any questions, feel free to <a href=\"mailto:support@OnenessSolar.com\" class=\"footer-link\">contact support</a>.</p>\n" +
        "        </div>\n" +
        "        <div class=\"email-footer\">\n" +
        "            <p>&copy; 2025 Oneness Solar. All rights reserved.</p>\n" +
        "            <p><a href=\"\" class=\"footer-link\">Terms of Service</a> | <a href=\"\" class=\"footer-link\">Privacy Policy</a></p>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "</body>\n" +
        "</html>";
    }

     public static String getQueryEmailBody(
        String firstName,
        String lastName,
        String phoneNumber,
        String email,
        String country,
        String city,
        String connectionType,
        String message
    ) {
        return "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "    <title>New Query Received</title>\n" +
            "    <style>\n" +
            "        body {\n" +
            "            font-family: Arial, sans-serif;\n" +
            "            margin: 0;\n" +
            "            padding: 0;\n" +
            "            background-color: #f4f7fa;\n" +
            "            color: #333;\n" +
            "        }\n" +
            "        .email-container {\n" +
            "            width: 100%;\n" +
            "            max-width: 600px;\n" +
            "            margin: 0 auto;\n" +
            "            background-color: #ffffff;\n" +
            "            border-radius: 8px;\n" +
            "            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);\n" +
            "        }\n" +
            "        .email-header {\n" +
            "            background-color: #007bff;\n" +
            "            color: #ffffff;\n" +
            "            padding: 20px;\n" +
            "            text-align: center;\n" +
            "            border-radius: 8px 8px 0 0;\n" +
            "        }\n" +
            "        .email-header h1 {\n" +
            "            margin: 0;\n" +
            "            font-size: 24px;\n" +
            "        }\n" +
            "        .email-body {\n" +
            "            padding: 20px;\n" +
            "        }\n" +
            "        .email-body p {\n" +
            "            line-height: 1.6;\n" +
            "            font-size: 16px;\n" +
            "            margin: 8px 0;\n" +
            "        }\n" +
            "        .label {\n" +
            "            font-weight: bold;\n" +
            "            color: #007bff;\n" +
            "        }\n" +
            "        .email-footer {\n" +
            "            background-color: #f1f1f1;\n" +
            "            text-align: center;\n" +
            "            padding: 15px;\n" +
            "            font-size: 14px;\n" +
            "            color: #777;\n" +
            "            border-radius: 0 0 8px 8px;\n" +
            "        }\n" +
            "    </style>\n" +
            "</head>\n" +
            "<body>\n" +
            "    <div class=\"email-container\">\n" +
            "        <div class=\"email-header\">\n" +
            "            <h1>New Query: " + escapeHtml(connectionType) + "</h1>\n" +
            "        </div>\n" +
            "        <div class=\"email-body\">\n" +
            "            <p><span class=\"label\">First Name:</span> " + escapeHtml(firstName) + "</p>\n" +
            "            <p><span class=\"label\">Last Name:</span> " + escapeHtml(lastName) + "</p>\n" +
            "            <p><span class=\"label\">Phone Number:</span> " + escapeHtml(phoneNumber) + "</p>\n" +
            "            <p><span class=\"label\">Email:</span> " + escapeHtml(email) + "</p>\n" +
            "            <p><span class=\"label\">Country:</span> " + escapeHtml(country) + "</p>\n" +
            "            <p><span class=\"label\">City:</span> " + escapeHtml(city) + "</p>\n" +
            "            <p><span class=\"label\">Message:</span> " + escapeHtml(message) + "</p>\n" +
            "        </div>\n" +
            "        <div class=\"email-footer\">\n" +
            "            <p>&copy; 2025 Clover. All rights reserved.</p>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</body>\n" +
            "</html>";
    }

    // Simple HTML escape to prevent breaking email layout
    private static String escapeHtml(String input) {
        if (input == null) return "";
        return input.replace("&", "&amp;")
                    .replace("<", "&lt;")
                    .replace(">", "&gt;")
                    .replace("\"", "&quot;")
                    .replace("'", "&#39;");
    }
}
