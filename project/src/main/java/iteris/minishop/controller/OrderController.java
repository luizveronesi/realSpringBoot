package iteris.minishop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iteris.minishop.domain.Order;
import iteris.minishop.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping(value = "/page")
	public ResponseEntity<Page<Order>> page() {
		return ResponseEntity.ok(orderService.page(0, 5));
	}

	@GetMapping(value = "/list")
	public ResponseEntity<List<Order>> list() {
		return ResponseEntity.ok(orderService.list());
	}
}