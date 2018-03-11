package chapter25;

import bean.Item;
import bean.Product;
import tool.Action;
import dao.PurchaseDAO;
import javax.servlet.http.*;
import java.util.List;

public class PrePurchaseAction extends Action {

    @SuppressWarnings("unchecked")
    public String execute(
            HttpServletRequest request, HttpServletResponse response
    ) throws Exception {

        HttpSession session = request.getSession();

        String name = request.getParameter("name");
        String address = request.getParameter("address");

        if (name.isEmpty() || address.isEmpty()) {
            return "purchase-error-empty.jsp";
        }

        PurchaseDAO dao = new PurchaseDAO();
        List<Item> cart = (List<Item>) session.getAttribute("cart");
        if (cart == null || !dao.insert(cart, name, address)) {
            return "purchase-error-insert.jsp";
        }

        session.setAttribute("name", name);
        session.setAttribute("address", address);
        
        return "pre-purchase.jsp";

    }
}
