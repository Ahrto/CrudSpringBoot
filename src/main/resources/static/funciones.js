// Funcion para el Alert al eliminar un registro
function eliminar(id) {
	swal({
		title: "¿Estás seguro de que quieres eliminar el usuario?",
		text: "Una vez eliminado no podrás recuperarlo.",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				// Cuando el usuario da el ok ejecuatamos la funcion eliminar mediante AJAX
				$.ajax({
					url: "/eliminar/" + id,

					success: function(res) {
						console.log(res);
					}
				});
				swal("¡El usuario ha sido eliminado!", {
					icon: "success",
				}).then((ok) => {
					if (ok) {
						location.href = "/listar"
					}
				});
			} else {
				swal("No se ha borrado el usuario.");
			}
		});

}