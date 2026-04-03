class FileProcessingSystem:
    def read_file(self, filename):
        try:
            # Simulate reading a file
            print("Reading file...")
            # Simulate an operation that could cause an exception
            if filename == "":
                raise FileNotFoundError("No file specified")
        except FileNotFoundError as e:
            print(f"Error: {e}")
        finally:
            # Cleanup block always executed
            print("Closing file resources")

# Example usage
fps = FileProcessingSystem()
fps.read_file("example.txt")  # Normal case
