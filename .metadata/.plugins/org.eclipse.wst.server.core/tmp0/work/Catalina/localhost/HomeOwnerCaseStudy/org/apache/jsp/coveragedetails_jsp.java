/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.81
 * Generated at: 2017-09-19 04:43:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.home.model.QuoteDetails;
import com.home.model.*;
import com.home.bo.*;

public final class coveragedetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Coverage Details</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./CSS/style.css\">\r\n");
	
	int location_id = Integer.parseInt(session.getAttribute("locationId").toString());
	Users user = (Users) session.getAttribute("user");
	int user_id = user.getUserId();
	PropertyDetails property = null;
	PropertyDetailBO propertyBO = new PropertyDetailBO();
	property = propertyBO.getOneLocationId(user_id, location_id);

	LocationAddress location = null;
	LocationAddressBO locationBO = new LocationAddressBO();
	location = locationBO.getOneLocationAddress(user_id, location_id);
	
	QuoteDetails quote = null;
	QuoteDetailBO quoteBO = new QuoteDetailBO();
	quote = quoteBO.getQuoteDetails(user_id);
	
 
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"logintxtsection\">\r\n");
      out.write("\t\t\t<img class=\"stockphoto1\" style=\"width: 300px\" alt=\"home\"\r\n");
      out.write("\t\t\t\tsrc=\"http://www.leisepropertyservices.com/wp-content/uploads/2014/12/selling-your-home-cedar-shingle-home11.jpg\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<!-- ");
      out.print((String) request.getAttribute("monthly_premium") );
      out.write("\r\n");
      out.write("\t\t");
      out.print((String) request.getAttribute("dwelling_coverage") );
      out.write("\r\n");
      out.write("\t\t");
      out.print((String) request.getAttribute("detached_structures") );
      out.write("\r\n");
      out.write("\t\t");
      out.print((String) request.getAttribute("personal_property") );
      out.write("\r\n");
      out.write("\t\t");
      out.print((String) request.getAttribute("med_exp") );
      out.write("\r\n");
      out.write("\t\t");
      out.print((String) request.getAttribute("add_living_expenses") );
      out.write("\r\n");
      out.write("\t\t");
      out.print((String) request.getAttribute("deductible") );
      out.write("\r\n");
      out.write("\t\t");
      out.print((String) request.getAttribute("issue_date") );
      out.write(" -->\r\n");
      out.write("\r\n");
      out.write("\t\t<a href=\"homeInsuranceQuote.html\">Additional Info</a>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<div class=\"loginformsection\">\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>Quote Id</th>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<!-- <td>$");
      out.write("</td> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>Monthly Premium</th>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(quoteBO.makeMonthlyPremium(property.getMarketValue(), location.getResidenceType()));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<!-- <td>");
      out.write("</td> -->\r\n");
      out.write("\t\t\t\t\t<!--<td>$");
      out.write("</td> -->\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>Detached Structure</th>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(quoteBO.calcDetachedStructures());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<!-- <td>$");
      out.write("</td> -->\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>Personal Property</th>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(quoteBO.calcPersonalProperty());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<!-- <td>$");
      out.write("</td> -->\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>Additional living expense</th>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(quoteBO.calcAdditionalLiving());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<!-- <td>$");
      out.write("</td> -->\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>Medical expense</th>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(quoteBO.calcMedExp());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<!-- <td>$");
      out.write("</td> -->\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>Deductible</th>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(quoteBO.calcDeductible());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<!-- <td>$");
      out.write("</td> -->\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<form action=\"QuoteDetailServlet?action=save\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"user_id\" value=");
      out.print( user.getUserId() );
      out.write(" />\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"monthly_premium\" value=");
      out.print( quoteBO.makeMonthlyPremium(property.getMarketValue(), location.getResidenceType()) );
      out.write(" />\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"dwelling_coverage\" value=");
      out.print( quoteBO.createDwellingCoverage(property.getSqft(), property.getYearBuilt()) );
      out.write(" />\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"detached_structures\" value=");
      out.print( quoteBO.calcDetachedStructures() );
      out.write(" />\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"personal_property\" value=");
      out.print( quoteBO.calcPersonalProperty() );
      out.write(" />\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"add_living_expenses\" value=");
      out.print( quoteBO.calcAdditionalLiving() );
      out.write(" />\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"med_exp\" value=");
      out.print( quoteBO.calcMedExp() );
      out.write(" />\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"deductible\" value=");
      out.print( quoteBO.calcDeductible() );
      out.write(" />\r\n");
      out.write("\t\t\t\t<input type=\"submit\" name=\"Proceed to buy\" value=\"continue\" />\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
